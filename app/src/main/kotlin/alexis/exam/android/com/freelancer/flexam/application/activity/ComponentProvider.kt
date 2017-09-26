package alexis.exam.android.com.freelancer.flexam.application.activity

/**
 * Created by alzayon on 9/27/2017.
 */
interface ComponentProvider<T> {
    fun getComponent() : T
}