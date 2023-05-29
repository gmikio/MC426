package exercise4;

import java.util.Set;

public class Person {

	private Set courses;

	public Set getCourses() {
		return courses;
	}

	public void setCourses(Set arg) {
		courses = arg;
	}

    public void addCourse(Set arg){
        courses.add(arg);
    }

    public void removeCourse(Set arg){
        courses.remove(arg);
    }
    
    public int getCoursesQuantity(){
        return getCourses().size();
    }

    public int getAdvancedCoursesQuantity(){
        Iterator iter = getCourses().iterator();
        int count = 0;
        while (iter.hasNext()) {
            Course each = (Course) iter.next();
            if (each.isAdvanced()) {
                count++;
            }
        }
        return count;  
    }

}
