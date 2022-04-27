package upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DownloadController {

	@RequestMapping("/filedownloadlist")
	public ModelAndView downloadList() {
		File f = new File("d:/documents/KDT/upload");
		String[] fileArray = f.list();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("fileArray", fileArray);
		mv.setViewName("upload/downloadList");
		return mv;
	}
	
	@RequestMapping("/filedownloadresult")
	public void downloadResult(String filename, HttpServletResponse response) throws IOException {
		// ���� �� ����
		File f = new File("d:/documents/KDT/upload/", filename);
		int len = (int)f.length();
		
		// ���� �ٿ�ε� ����
		response.setContentType("application/download");
		response.setContentLength(len);
		response.setHeader("Content-Disposition", "attachment;filename=\"" + filename + "\"");
		
		// ���� ����
		OutputStream out = response.getOutputStream(); // ������ ���� ��� ��ü
		FileInputStream fin = new FileInputStream(f); // ���� �Է� ��ü ����
		FileCopyUtils.copy(fin, out); // ���� ���� �Է� ��ü�� ������ ���� ��� ��ü�� ���� 
		fin.close();
		out.close();
	}
}
