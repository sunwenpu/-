package com.example.demo.API;

import com.example.demo.dto.Dto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


public interface OswpService {
//全部查询（分页还没写）返回值应该是
    @RequestMapping(value = "/swp",method = RequestMethod.GET)
    public List<Dto> get();

//根据ID进行查询
    @RequestMapping(value = "/swp/{Id}",method = RequestMethod.GET)
    public Dto getID(@PathVariable Long Id);

//新建
    @RequestMapping(value = "/swp",method = RequestMethod.POST)
    public  String create(@RequestBody Dto dto);

//更改
    @RequestMapping(value = "/swp/{Id}",method = RequestMethod.PUT)
    public String update(@RequestBody Dto dto, @PathVariable Long Id);

//假删除
    @RequestMapping(value = "/swp/deletely/{Id}",method = RequestMethod.PUT)
    public String delete(@RequestBody Dto dto,@PathVariable Long Id);
//真删除
    @RequestMapping(value = "/swp/{Id}",method = RequestMethod.DELETE)
    public String deletely(@PathVariable Long Id);

//删除全部
    @RequestMapping(value = "/deletely",method = RequestMethod.DELETE)
    public String deleteAll();





}
