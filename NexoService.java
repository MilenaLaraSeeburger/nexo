package com.nexo.server.Service;

import com.nexo.server.DAO.NexoDAO;
import com.nexo.server.Entity.TighteningProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NexoService {

    @Autowired
    private NexoDAO nexoDAO;

    public void insertResult(TighteningProcess tighteningProcess) {
        nexoDAO.insert(tighteningProcess);
        System.out.println("Nr.: "+tighteningProcess.getNr());
        System.out.println("IdCode: "+tighteningProcess.getIdcode());
        System.out.println("test2");
        System.out.println("another test");
    }

    public List<TighteningProcess> getAllResults() {
        return nexoDAO.findAll();
    }

    public List<TighteningProcess> getLastNum(Integer num) {
        Pageable pageable = PageRequest.of(0, num, Sort.Direction.DESC, "date");
        Page<TighteningProcess> processes = nexoDAO.findAll(pageable);
        List<TighteningProcess> processList = processes.getContent();
        return processList;
    }
}
