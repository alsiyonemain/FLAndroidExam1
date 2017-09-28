package alexis.exam.android.com.freelancer.flexam.application.activity

import alexis.exam.android.com.freelancer.dto.Profile
import alexis.exam.android.com.freelancer.dto.Skill
import alexis.exam.android.com.freelancer.flexam.R
import alexis.exam.android.com.freelancer.flexam.application.DaggerFLApplication_FLComponent
import alexis.exam.android.com.freelancer.flexam.application.FLApplication
import alexis.exam.android.com.freelancer.flexam.application.modules.InteractorModule
import alexis.exam.android.com.freelancer.flexam.application.modules.PresenterModule
import alexis.exam.android.com.freelancer.flexam.application.presenter.ProfilePresenter
import alexis.exam.android.com.freelancer.flexam.application.view.ProfileView
import alexis.exam.android.com.freelancer.scope.ActivityScope
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import dagger.Component
import javax.inject.Inject

class ProfileActivity : AppCompatActivity(), ProfileView, ComponentProvider<ProfileActivity.ProfileComponent> {

    @Inject
    lateinit var profilePresenter : ProfilePresenter

    var _component: ProfileComponent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_activity)
        setSupportActionBar(findViewById(R.id.toolbar))

        getComponent().inject(this)
        profilePresenter.setView(this)

        //Fetch the profile
        profilePresenter.fetchProfile()
    }

    override fun onProfileLoaded(profile : Profile) {
        setupBasicProfile(profile)
        setupSkillsList(profile)
        setupExamsList(profile)
    }

    private fun setupBasicProfile(profile : Profile) {
        val smallName = findViewById<TextView>(R.id.smallName)
        val bigName = findViewById<TextView>(R.id.bigName)
        smallName.text = profile.username
        bigName.text = profile.username
    }

    private fun setupSkillsList(profile : Profile) {
        val skillsListView = findViewById<RecyclerView>(R.id.skillsListView)
        skillsListView.setHasFixedSize(true);
        val layoutManager = LinearLayoutManager(this);
        skillsListView.setLayoutManager(layoutManager);

        val skillsListAdapter = SkillsListAdapter(profile.skills);
        skillsListView.setAdapter(skillsListAdapter)
    }

    private fun setupExamsList(profile : Profile) {
        val examsListView = findViewById<RecyclerView>(R.id.examsListView)
        examsListView.setHasFixedSize(true);
        val layoutManager = LinearLayoutManager(this);
        examsListView.setLayoutManager(layoutManager);

        val examsListAdapter = ExamsListAdapter(profile.exams);
        examsListView.setAdapter(examsListAdapter)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings ->
                return true
            else -> super.onOptionsItemSelected(item)
        }
    }

    @ActivityScope
    @Component(dependencies = arrayOf(FLApplication.FLComponent::class), modules = arrayOf(PresenterModule::class, InteractorModule::class))
    interface ProfileComponent {
        fun inject(profileActivity : ProfileActivity)
    }

    override fun getComponent(): ProfileComponent {
        if (_component == null) {

            val app = application as FLApplication
            _component = DaggerProfileActivity_ProfileComponent.builder()
                    .fLComponent(app.getComponent())
                    .build();
        }
        return _component!!
    }

}
