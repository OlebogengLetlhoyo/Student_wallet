/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolsystem;

/**
 *
 * @author Olebogeng Letlhoyo
 */
public class module {
    String moduleCode,Semester;

    public module(String moduleCode, String Semester) {
        this.moduleCode = moduleCode;
        this.Semester = Semester;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public String getSemester() {
        return Semester;
    }
    
}
