package gorick.gradesprojectandroid.MVP.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sg-0036936 on 06/03/2017.
 */

@Data
@NoArgsConstructor
public class GradeModel {

    private String matter;
    private int fault;
    private double grade;

}