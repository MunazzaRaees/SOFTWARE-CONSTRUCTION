package rules;

import static org.junit.Assert.*;

import org.junit.Test;

public class RulesOf6005Test {
    
   
    @Test
    public void testMayUseCodeInAssignment() {
        assertFalse("Expected false: un-cited publicly-available code",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
        assertTrue("Expected true: self-written required code",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }

  
    @Test
    public void testNotWrittenByYourselfWithCitationAndCoursework() {
        assertTrue("Expected true: cited coursework",
                RulesOf6005.mayUseCodeInAssignment(false, true, true, true, true));
    }

    
    @Test
    public void testNotWrittenByYourselfWithoutCitationButCoursework() {
        assertFalse("Expected false: un-cited coursework",
                RulesOf6005.mayUseCodeInAssignment(false, false, true, false, true));
    }
}
