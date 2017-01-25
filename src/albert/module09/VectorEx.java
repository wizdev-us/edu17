package albert.module09;



import java.util.List;
import java.util.Vector;
 
public class VectorEx {
 
    public static void main(String[] args) {
        List<Board> list = new Vector<Board>();
 
        for (int i = 1; i <= 5; i++) {
            list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
        }
 
        list.remove(2);
        list.remove(3);
 
        for (Board board : list) {
            System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
        }
    }
 
}

class Board {
    String subject;
    String content;
    String writer;
 
    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }
 
    public String getSubject() {
        return subject;
    }
 
    public void setSubject(String subject) {
        this.subject = subject;
    }
 
    public String getContent() {
        return content;
    }
 
    public void setContent(String content) {
        this.content = content;
    }
 
    public String getWriter() {
        return writer;
    }
 
    public void setWriter(String writer) {
        this.writer = writer;
    }
 
}
