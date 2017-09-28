package alexis.exam.android.com.freelancer.flexam.application.view

import alexis.exam.android.com.freelancer.dto.Profile

/**
 * Created by alexis on 9/27/17.
 */
interface ProfileView : View {
    fun onProfileLoaded(profile : Profile)
}