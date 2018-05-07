package sjsu.jentab.EaseYourLease.controller;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.twitter.api.CursoredList;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

@Controller
public class TwitterController {

//    private Twitter twitter;
//    private ConnectionRepository connectionRepository;
//
//    @Inject
//    public TwitterController(Twitter twitter, ConnectionRepository connectionRepository) {
//        this.twitter = twitter;
//        this.connectionRepository = connectionRepository;
//    }
//
//
//    @RequestMapping(method= RequestMethod.GET ,value="/twitterconnect")
//    public String helloTwitter(ModelMap model) {
//        if (connectionRepository.findPrimaryConnection(Twitter.class) == null) {
//            return "redirect:/connect/twitter";
//        }
//        twitter.timelineOperations().updateStatus("We have Apartments available for rent at affordable prices.\n" +
//                "Please contact +1*******332 for more information");
//        model.addAttribute(twitter.userOperations().getUserProfile());
//        CursoredList<TwitterProfile> friends = twitter.friendOperations().getFriends();
//        model.addAttribute("friends", friends);
//        return "twitterconnect";
//    }
}
