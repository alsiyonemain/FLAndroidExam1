package alexis.exam.android.com.freelancer.flexam.application.activity

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
import android.view.Menu
import android.view.MenuItem
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
        var profile = profilePresenter.fetchProfile()

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
