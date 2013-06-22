package builder;

public class Game {
	private String title = "";
	private String content = "";
	private String end = "";
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	
	public String toString(){
		return "[Title]=" + title + " [Content]=" +content + " [End]=" +end;
	}

}
