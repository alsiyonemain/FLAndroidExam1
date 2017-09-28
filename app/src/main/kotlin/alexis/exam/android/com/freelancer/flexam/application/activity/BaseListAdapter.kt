package alexis.exam.android.com.freelancer.flexam.application.activity

import alexis.exam.android.com.freelancer.flexam.R
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout

/**
 * Created by alexis on 9/28/17.
 */
abstract class BaseListAdapter<T>() : RecyclerView.Adapter<BaseListAdapter.CustomViewHolder>() {
    abstract val mDataset : List<T>?

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    class CustomViewHolder(val linearLayout : LinearLayout) : RecyclerView.ViewHolder(linearLayout) {
        // each data item is just a string in this case
        fun getCheckBox() : CheckBox {
            val v = itemView as LinearLayout
            return v.getChildAt(0) as CheckBox
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent : ViewGroup,
                                    viewType : Int) : BaseListAdapter.CustomViewHolder {

        // create a new view
        val v : LinearLayout = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_checkbox, parent, false) as LinearLayout


        // set the view's size, margins, paddings and layout parameters
        val vh : CustomViewHolder = CustomViewHolder(v)
        return vh
    }


}