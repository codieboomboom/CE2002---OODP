import java.util.*;
import java.io.*;

/**
 * A class for Assessment
 */
public class Assessment implements Serializable{

    private String assessmentName;
    private Double weightage;
	private HashMap<Student, Double> assessmentResults = new HashMap<Student, Double>();
	
	/**
	 * Constructor for an Assessment object/component. The attributes being instantiated are as below:
	 * @param name String the name of the Assessment object being constructed. 
	 * @param weightage double the weightage of the Assessment object (in percentage).
	 */
    public Assessment(String name, double weightage){
        this.assessmentName = name;
        this.weightage = weightage;
    }

	/**
	 * A method to return the name of the calling Assessment object/component. 
	 * @return String the name of calling Assessment object/component.
	 */
    public String getAssessmentName(){
        return this.assessmentName;
    }

	/**
	 * A method to return the weightage of the calling Assessment object/component. 
	 * @return String the name of calling Assessment object/component.
	 */
    public Double getWeightage(){
        return this.weightage;
    }

	/**
	 * A method to set the name of calling Assessment object/component
	 * @param assessmentName String the name of Assessment object/component being set.
	 */
    public void setAssessmentName(String assessmentName){
        this.assessmentName = assessmentName;
    }
	
	/**
	 * A method to set the weightage of the calling Assessment object/component (in percentage).
	 * @param weightage double the weightage of the Assessment object/component.
	 */
    public void setWeightage(Double weightage){
        this.weightage = weightage;
    } 
	
	/**
	 * A method to store the calling Assessment object result for a Student object being parsed in
	 * @param student Student student object to store mark/grade in.
	 * @param marks double the mark/grad to be stored in for the Student object.
	 * @see HashMap<Student, Double>
	 */
	public void storeAssessmentResult(Student student, double marks){
		assessmentResults.put(student, marks);
	}

	/**
	 * A method to return the grade/mark of the calling Assessment object for the Student object being parsed in.
	 * @param student Student student who grade/mark to be searched and returned.
	 * @return double the grade/mark of the Assessment of the student being parse in if succeed.
	 * @return double 0 if the Student object parsed in is not valid.
	 * @see HashMap<Student, Double>
	 */
	public double retrieveAssessmentResult(Student student){
		if(assessmentResults.get(student)!= null){
			return assessmentResults.get(student);
		}
		else{
			return 0;  // for checking purpose
		}
	}

	/**
	 * A method to remove the grade/mark of Student object under the calling Assessment object.
	 * @param student Student object whose Assessment result is removed.
	 * @return boolean false if the removal of Assessement result for the Student is failed.
	 * @return boolean true if the removal of Assessment result for the Student is successful.
	 * @see HashMap<Student, Double> 
	 */
	public boolean removeAssessmentResult(Student student){
		boolean success = false; 
		if(assessmentResults.get(student) != null){
			assessmentResults.remove(student);
			success = true;
		}
		return success;
	}
	

}