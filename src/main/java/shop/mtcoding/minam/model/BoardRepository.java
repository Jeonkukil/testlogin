package shop.mtcoding.minam.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {

    public List<Board> findAll();

    public Board findById(int id);

}
