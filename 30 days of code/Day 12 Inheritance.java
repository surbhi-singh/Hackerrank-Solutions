class Student extends Person{
	private int[] testScores;
      
       float s = 0;
       for(int i = 0; i< testScores.length;i++)
    Student(String firstName, String lastName, int idNumber, int[] testScore)
        {
        super(firstName, lastName, idNumber);
        testScores = new int[testScore.length];
        for(int i = 0; i < testScore.length; i++)
            testScores[i] = testScore[i];
    }
   char calculate()
    {
            s = s+testScores[i];
       s = s/testScores.length;
      if(s>=90.0 && s<= 100.0)
           return 'O';
       else if(s>=80.0 && s<90.0)
           return 'E';
       else if(s>=70.0 && s<80.0)
           return 'A';
       else if(s>=55.0 && s<70.0)
           return 'P';
       else if(s>=40.0 && s<55.0)
           return 'D';
       else
           return 'T';
   }
}