package alexis.exam.android.com.freelancer.flexam.application.presenter

import alexis.exam.android.com.freelancer.flexam.application.view.View

/**
 * Created by alzayon on 9/28/2017.
 */
interface Presenter<T : View?> {
    fun getView() : T?
    fun setView(v : T?)
}