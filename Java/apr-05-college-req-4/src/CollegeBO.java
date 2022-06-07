import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollegeBO {
	public List<College> findCollege(List<College> collegeList,List<String> nameList){
		List<College> result=new ArrayList<College>();
		for(String name:nameList)
		{
			for(College college:collegeList)
			{
				if(college.getName().equals(name))
				{
					result.add(college);
				}
			}
		}
		return result;
	}
	public List<College> findCollege(List<College> collegeList,Date startingDate){
		return null;
	}
	public List<College> findCollege(List<College> collegeList, String location){
		return null;
	}

}
