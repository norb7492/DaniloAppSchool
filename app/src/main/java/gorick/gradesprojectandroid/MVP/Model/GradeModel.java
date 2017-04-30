package gorick.gradesprojectandroid.MVP.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

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
    private BigDecimal grade;

    @SerializedName("fault")
    @Expose
    private int faul;

    @SerializedName("class")
    @Expose
    private String classS;



    //@SerializedName("boletim")
    //@Expose
    //private ClassList[] classList;

    //@SerializedName("boletim")
    //@Expose
    //private FaultList[] faultList;

}