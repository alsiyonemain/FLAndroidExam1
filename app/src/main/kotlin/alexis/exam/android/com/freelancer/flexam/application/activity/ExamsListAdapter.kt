package alexis.exam.android.com.freelancer.flexam.application.activity

import alexis.exam.android.com.freelancer.dto.Exam
import alexis.exam.android.com.freelancer.dto.Skill
import android.util.Log

/**
 * Created by alexis on 9/28/17.
 */
class ExamsListAdapter(override val mDataset : List<Exam>?) : BaseListAdapter<Exam>() {
    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder : CustomViewHolder, position : Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        val textView = holder.getCheckBox()
        if (mDataset != null) {
            val exam = mDataset.get(position)
            textView.setText(String.format("%s (%d/100)", exam.name, exam.progress))
            Log.v("ExamListAdapter", exam.name)
        } else {
            Log.v("ExamListAdapter", "No value")
        }

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() : Int {
        if (mDataset != null) {
            return mDataset.size
        }
        return 0
    }
}