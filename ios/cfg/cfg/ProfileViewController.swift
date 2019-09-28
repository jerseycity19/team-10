//
//  ProfileViewController.swift
//  cfg
//
//  Created by Helal Chowdhury on 9/28/19.
//  Copyright © 2019 Helal. All rights reserved.
//

import UIKit

class ProfileViewController: UIViewController {
    @IBOutlet weak var meetingTableView: UITableView!
    
    var events: [Meeting] = []
    
    override func viewDidLoad() {
        super.viewDidLoad()
        meetingTableView.delegate = self
        meetingTableView.dataSource = self
        events = createArray()
        
    }
    
    func createArray() -> [Meeting] {
        let tempBool: [Meeting] = [Meeting.e1, Meeting.e2, Meeting.e3, Meeting.e4]
        print("1")
        return tempBool
        
    }
    
    
}

extension ProfileViewController: UITableViewDelegate, UITableViewDataSource {
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return events.count
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let event = events[indexPath.row]
        print("10")
        
        let cell = tableView.dequeueReusableCell(withIdentifier: "Meeting Table View Cell") as! MeetingsTableViewCell
        print("100")
        
        cell.setMeetings(event: event)
        
        return cell
    }
    
    func numberOfSections(in tableView: UITableView) -> Int {
        return 1
    }
    
    


}
