package com.nt.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.nt.model.Part;

public class PartPdfView extends AbstractPdfView {

	public void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		//Download file
		response.addHeader("Content-Disposition", "attachement;filename=shipments.pdf");
		//Create Element
		
		Paragraph p=new Paragraph("WELCOME TO PART");
		//Add element to document
		document.add(p);
		//read data from model
		List<Part> list=(List<Part>) model.get("list");
		// creating table with no. of columns
		PdfPTable t= new PdfPTable(8);
		t.addCell("ID");
		t.addCell("CODE");
		t.addCell("LENGTH");
		t.addCell("WIDTH");
		
		t.addCell("HEIGHT");
		t.addCell("COST");
		t.addCell("CURRENCY");
		t.addCell("NOTE");
		
		//adding data to table
		for(Part st:list) {
			t.addCell(st.getId().toString());
			t.addCell(st.getPartCode());
			/*
			 * t.addCell(st.getPartLen()); t.addCell(st.getPartWid());
			 * t.addCell(st.getPartHgt()); t.addCell(st.getBasecost());
			 * t.addCell(st.getBaseCurrency()); t.addCell(st.getNote());
			 */			
			
		}
		//add table to document
		document.add(t);
		//print date and time
		document.add(new Paragraph(new Date().toString()));
	}

}
