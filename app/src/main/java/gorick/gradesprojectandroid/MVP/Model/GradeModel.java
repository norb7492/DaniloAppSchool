package gorick.gradesprojectandroid.MVP.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.text.DecimalFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sg-0036936 on 06/03/2017.
 */

@Data
@NoArgsConstructor
public class GradeModel {

    @SerializedName("grade")
    @Expose
    private DecimalFormat grades;

    private String matter;
    private int fault;


}