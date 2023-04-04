package org.zerock.jdbcex.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.jdbcex.domain.TodoVO;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TodoDAOTest {

    private TodoDAO todoDAO;

    @BeforeEach
    void ready() {
        todoDAO = new TodoDAO();
    }

    @Test
    void getTime() throws Exception{

        System.out.println(todoDAO.getTime());
    }

    @Test
    public void testInsert() throws Exception {

        TodoVO vo = TodoVO.builder()
                .title("sampleTitle...")
                .dueDate(LocalDate.of(2021,12,13))
                .finished(true)
                .build();

        todoDAO.insert(vo);

    }

    @Test
    public void testList() throws Exception{

        List<TodoVO> list = todoDAO.selectAll();

//        for (TodoVO vo : list) {
//            System.out.println(vo.toString());
//        }

        list.forEach(System.out::println);
    }

    @Test
    public void testSelectOne() throws Exception {

        Long tno = 2L;

        TodoVO vo = todoDAO.selectOne(tno);

        System.out.println(vo);

    }

    @Test
    void testUpdateOne() throws Exception {
        TodoVO todoVO = TodoVO.builder()
                .tno(1L)
                .title("Update Sample...")
                .dueDate(LocalDate.of(2021,12,31))
                .finished(true)
                .build();

        todoDAO.updateOne(todoVO);
    }
}