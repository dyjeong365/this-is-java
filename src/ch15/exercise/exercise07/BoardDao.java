package ch15.exercise.exercise07;

import java.util.Arrays;
import java.util.List;

public class BoardDao {
    private List<Board> boardList = Arrays.asList(
            new Board("제목1", "내용1"),
            new Board("제목2", "내용2"),
            new Board("제목3", "내용3")
    );

    public List<Board> getBoardList() {
        return boardList;
    }
}
