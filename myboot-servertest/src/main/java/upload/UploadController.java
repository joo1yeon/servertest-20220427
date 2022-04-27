package upload;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	@RequestMapping(value="/fileupload", method=RequestMethod.GET)
	public String uploadform() {
		return "upload/uploadForm";
	}
	
	@RequestMapping(value="/fileupload", method=RequestMethod.POST)
	public String uploadresult(@ModelAttribute("dto") UploadDTO dto) throws IOException {
		
		MultipartFile mf1 = dto.getFile1();
		MultipartFile mf2 = dto.getFile2();
		
		System.out.println(dto.getName());
		System.out.println(dto.getDescription());
		// 파일 이름
		System.out.println(mf1.getOriginalFilename());
		System.out.println(mf2.getOriginalFilename());
		// 파일 길이
		System.out.println(mf1.getSize());
		System.out.println(mf2.getSize());
		// 파일 선택 여부
		System.out.println(mf1.isEmpty());
		System.out.println(mf2.isEmpty());
		
		// 파일 내용 + 파일명 => 서버 c:/upload 특정 디렉토리나 db에 저장 필요
		String savePath = "d:/documents/KDT/upload/";
		
		if (!mf1.isEmpty()) {
			String originName1 = mf1.getOriginalFilename();
			String beforeExt1 = originName1.substring(0, originName1.indexOf("."));
			String ext1 = originName1.substring(originName1.indexOf("."));
			File serverfile1 = new File(savePath + beforeExt1 + "(" + UUID.randomUUID().toString() + ")" + ext1);
			mf1.transferTo(serverfile1);
		}
		if (!mf2.isEmpty()) {
			// 원래 파일명		
			String originName2 = mf2.getOriginalFilename();
			
			// 확장자 이전 파일명
			String beforeExt2 = originName2.substring(0, originName2.indexOf("."));
			
			// 확장자 이후		
			String ext2 = originName2.substring(originName2.indexOf("."));		
			
			File serverfile2 = new File(savePath + beforeExt2 + "(" + UUID.randomUUID().toString() + ")" + ext2);
			mf2.transferTo(serverfile2);			
		}		
		
		// System.out.println(UUID.randomUUID().toString().substring(0, 10));
		// System.out.println(UUID.randomUUID().toString());
		
		return "upload/uploadResult";
	}
}
