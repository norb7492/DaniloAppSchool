package gorick.gradesprojectandroid.MVP.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sg-0036936 on 31/03/2017.
 */

@Data
@NoArgsConstructor
public class Boletim {

    @SerializedName("grade")
    @Expose
    private double grade;

}
