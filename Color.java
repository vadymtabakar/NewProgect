package ua.com.foxminded.carmanager;

public enum Color {
	BLACK("Black"),

	ORANGE("Orange"),

	WHITE("White"),

	YELLOW("Yellow"),

	BLUE("Blue"),
	
	GOLD("Gold"),

	GREEN("Green");

	public String nameOfColor;

	Color(String nameOfColor) {
        this.nameOfColor = nameOfColor;
    }

    public String getnameOfColor() {
        return nameOfColor;
    }

	


	}

	

   

