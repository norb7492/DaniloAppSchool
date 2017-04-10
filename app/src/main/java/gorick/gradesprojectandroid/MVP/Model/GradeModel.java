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

    @SerializedName("boletim")
    @Expose
    private GradeList[] reportLists;

    //@SerializedName("boletim")
    //@Expose
    //private ClassList[] classList;

    //@SerializedName("boletim")
    //@Expose
    //private FaultList[] faultList;

}