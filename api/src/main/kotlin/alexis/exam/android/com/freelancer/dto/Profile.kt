package alexis.exam.android.com.freelancer.dto

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by alzayon on 9/27/2017.
 */
class Profile @JsonCreator constructor(@JsonProperty("username") val username : String,
                                       @JsonProperty("files") val files: List<String>,
                                       @JsonProperty("attachments") val attachments: List<String>,
                                       @JsonProperty("bid_period") val bidPeriod: Int,
                                       @JsonProperty("skills") val skills: List<Skill>,
                                       @JsonProperty("exams") val exams: List<Exam>,
                                       @JsonProperty("avatar") val avatar: String) {

}