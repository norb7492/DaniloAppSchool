package gorick.gradesprojectandroid.MVP.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sg-0036936 on 31/03/2017.
 */

@Data
@NoArgsConstructor
public class GradeList extends GradeModel{

    @SerializedName("boletim")
    @Expose
    private GradeModel[] reportLists;

}
