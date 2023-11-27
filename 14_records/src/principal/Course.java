package principal;

record Course(String name, int duration){
    Course{
    	duration=duration*2;
    }
}