package alexis.exam.android.com.freelancer.dto

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by alzayon on 9/27/2017.
 */
class Skill @JsonCreator constructor(@JsonProperty("name") val name : String) {

}