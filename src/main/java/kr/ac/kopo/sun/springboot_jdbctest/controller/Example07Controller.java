package kr.ac.kopo.sun.springboot_jdbctest.controller;

import kr.ac.kopo.sun.springboot_jdbctest.domain.Player;
import kr.ac.kopo.sun.springboot_jdbctest.domain.Team;
import kr.ac.kopo.sun.springboot_jdbctest.repository.PlayerRepository;
import kr.ac.kopo.sun.springboot_jdbctest.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/exam07")
public class Example07Controller {
    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    TeamRepository teamRepository;

    @GetMapping
    public String requestInsert(Model model) {
        Team team = new Team();
        team.setName("team01");
        teamRepository.save(team);
        
        Player player = new Player();
        player.setName("김폴리");
        player.setTeam(team);
        playerRepository.save(player);

        List<Player> players = playerRepository.findAll();
        List<Team> teams = teamRepository.findAll();

        model.addAttribute("playersList", players);
        model.addAttribute("teamsList", teams);

        return "viewPage07";
    }
}