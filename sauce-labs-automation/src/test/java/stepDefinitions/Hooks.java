package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import org.monte.screenrecorder.ScreenRecorder;
import pages.PIMPage;
import utilities.DriverManager;


public class Hooks {

    private static ScreenRecorder screenRecorder;

    PIMPage pimPage = new PIMPage(DriverManager.getDriver().driver);

    @AfterAll
    public static void afterAll(){
        DriverManager.getDriver().driver.close();
    }

    @After("@LogOutNeed")
    public void afterScenario(){
        pimPage.userImgClick();
        pimPage.userLogoutClick();
    }


/*
    @Before
    public void beforeScenarios(Scenario scenario) throws IOException, AWTException {
        startVideoRecording();
    }

    @After
    public void afterScenarios(Scenario scenario) throws IOException, AWTException {
        stopVideoRecording();
    }

    public void startVideoRecording() throws IOException, AWTException {
        GraphicsConfiguration gconfig = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getDefaultScreenDevice().getDefaultConfiguration();
        screenRecorder = new ScreenRecorder(gconfig,
                new Format(MediaTypeKey, FormatKeys.MediaType.FILE, MimeTypeKey, MIME_AVI),
                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey,
                        ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        DepthKey, (int)24, FrameRateKey, Rational.valueOf(15),
                        QualityKey, 1.0f,
                        KeyFrameIntervalKey, (int) (15 * 60)),
                new Format(MediaTypeKey, MediaType.VIDEO,
                        EncodingKey,"black", FrameRateKey, Rational.valueOf(30)), null);
        screenRecorder.start();
    }

    public void stopVideoRecording() throws IOException, AWTException {
        screenRecorder.stop();
    }
    */
}
