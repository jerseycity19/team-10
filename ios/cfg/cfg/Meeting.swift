//
//  Meeting.swift
//  cfg
//
//  Created by Helal Chowdhury on 9/28/19.
//  Copyright © 2019 Helal. All rights reserved.
//

import Foundation
import UIKit

class Meeting {
    var image: UIImage
    var date: String
    var day: String
    
    init(image: UIImage, date: String, day: String) {
        self.image = image
        self.date = date
        self.day = day
    }
}

//dummy varaibles
extension Meeting {
    static let e1 = Meeting(image: UIImage(named: "artMeeting") ?? UIImage(), date: "8", day: "Sat")
    static let e2 = Meeting(image: UIImage(named: "healthMeeting") ?? UIImage(), date: "11", day: "Tue")
    static let e3 = Meeting(image: UIImage(named: "jazzMeeting") ?? UIImage(), date: "9", day: "Sun")
    static let e4 = Meeting(image: UIImage(named: "3") ?? UIImage(), date: "12", day: "Sat")
}
