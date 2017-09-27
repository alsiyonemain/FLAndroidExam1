package alexis.exam.android.com.freelancer.flexam.application.presenter

import alexis.exam.android.com.freelancer.flexam.application.view.View

/**
 * Created by alexis on 9/27/17.
 */
abstract class BasePresenter<out T : View> {
    abstract fun getView() : T
}