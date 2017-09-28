package alexis.exam.android.com.freelancer.flexam.application.activity

import alexis.exam.android.com.freelancer.dto.Skill
import android.util.Log

/**
 * Created by alexis on 9/28/17.
 */
class SkillsListAdapter(override val mDataset : List<Skill>?) : BaseListAdapter<Skill>() {
    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder : CustomViewHolder, position : Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        val textView = holder.getCheckBox()
        if (mDataset != null) {
            val skill = mDataset.get(position)
            textView.setText(skill.name)
            Log.v("SkillListAdapter", skill.name)
        } else {
            Log.v("SkillListAdapter", "No value")
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