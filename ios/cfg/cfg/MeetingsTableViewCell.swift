//
//  MeetingsTableViewCell.swift
//  cfg
//
//  Created by Helal Chowdhury on 9/28/19.
//  Copyright © 2019 Helal. All rights reserved.
//

import UIKit

class MeetingsTableViewCell: UITableViewCell {

    @IBOutlet weak var meetingImageView: UIImageView!
    @IBOutlet weak var dateLabel: UILabel!
    @IBOutlet weak var dayLabel: UILabel!
    func setMeetings(event: Meeting) {
        meetingImageView.image = event.image
        dateLabel.text = event.date
        dayLabel.text = event.day
    }
    
}
