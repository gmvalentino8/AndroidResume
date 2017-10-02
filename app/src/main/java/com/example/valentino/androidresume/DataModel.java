package com.example.valentino.androidresume;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valentino on 1/24/17.
 */

public class DataModel {
  ArrayList<Education> educationList = new ArrayList<Education>();
  List<Experience> experienceList = new ArrayList<Experience>();

  private void initializeEducation() {
    educationList.add(new Education("University of Illinois at Urbana-Champaign",
                                    "Bachelors and Masters in Computer Science",
                                    "December 2018",
                                    "Urbana, IL",
                                    3.71));
    educationList.add(new Education("International School of Beijing",
                                    "International Baccalaureate Bilingual Diploma",
                                    "August 2012",
                                    "Beijing, China",
                                    3.91));
  }

  private void initializeExperience() {
    experienceList.add(new Experience("Retty",
                                      "Android Developer",
                                      "October 2016 - Present",
                                      "Tokyo, Japan",
                                      "Focused on writing production level code to fix bugs based on crash analytics and implement new features based on given specifications for weekly releases of the Android application",
                                      "Assisted in rebuilding the Android application from scratch, using Kotlin as the main language for development"));

    experienceList.add(new Experience("LanguageOM",
                                      "Techonology and Product Manager",
                                      "April 2016 - September 2016",
                                      "Chicago, IL",
                                      "Spearheading and managing the technological development of this startup company targeting young professionals in China to improve their English communication through classes with native English speakers",
                                      "Currently developing the entire iOS mobile application from the ground up to allow tutors and students to schedule classes through UI/UX design, user testing, and iterative implementation"));

    experienceList.add(new Experience("Capital One",
                                      "Android Developer Intern",
                                      "June 2015 - August 2015",
                                      "Champaign, IL",
                                      "Worked in a modified Large Scale AGILE environment to produce and finalize the Android version of the US Card News application based on the iOS version that was already in production",
                                      "Utilized Amazon Web Services to create an Alexa skill for dynamic budgeting the user’s previous spending data"));

    experienceList.add(new Experience("University of Illinois at Urbana Champaign",
                                      "Education Gamification Research Assistant",
                                      "June 2015 - August 2015",
                                      "Champaign, IL",
                                      "Engaged in education gamification research for Microsoft’s coding duel game called CodeHunt",
                                      "Analyzed Microsoft’s data set for reoccurring code structures to redesign the hint system for better feedback"));

    experienceList.add(new Experience("Demura Research Laboratory",
                                      "Robotics Research Assistant",
                                      "November 2014 - May 2015",
                                      "Kanazawa, Japan",
                                      "Collaborated with Japanese students to create an autonomous service robot for the RoboCup@Home league and placed 5th in the 2015 Japan Open and 9th in 2015 World Cup",
                                      "Assembled a navigation stack to build a floor map, calculate a path to a destination while avoiding obstacles",
                                      "Integrated computer vision and machine learning for object recognition through the OpenCV library"));
  }
}
