package registrar.RegaliaOrderingSystem.Dao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrar.RegaliaOrderingSystem.Dao.Repository.StateRepository;
import registrar.RegaliaOrderingSystem.Models.State;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StateService {

    @Autowired
    private StateRepository _stateRepository;

    public List<State> listAll(){
        return _stateRepository.findAll();
    }

    public void save(State state){
        _stateRepository.save(state);
    }

    public State get(Long id){
        return _stateRepository.findById(id).get();
    }

    public void delete(Long id){
        _stateRepository.deleteById(id);
    }
}
