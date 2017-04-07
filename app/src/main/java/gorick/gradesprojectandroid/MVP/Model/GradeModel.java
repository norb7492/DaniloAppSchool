package gorick.gradesprojectandroid.MVP.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sg-0036936 on 06/03/2017.
 */

@Data
@NoArgsConstructor
public class GradeModel {

    //@SerializedName("grade")
    //@Expose
    //private double grade;

    @SerializedName("boletim")
    @Expose
    private Boletim[] boletim;

    @SerializedName("class")
    @Expose
    private String matter;

    private int fault;


}