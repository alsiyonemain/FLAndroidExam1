package alexis.exam.android.com.freelancer.flexam.application.presenter

import alexis.exam.android.com.freelancer.flexam.application.view.View

/**
 * Created by alexis on 9/27/17.
 */
abstract class BasePresenter<T : View?> {
    protected var _view : T? = null

    fun setView(v : T?) {
        _view = v
    }

    fun getView() : T? {
        return _view
    }
}