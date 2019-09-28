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


    init(image: UIImage) {
        self.image = image

    }
}

//dummy varaibles
extension Meeting {
    static let e1 = Meeting(image: UIImage(named: "artMeeting") ?? UIImage())
    static let e2 = Meeting(image: UIImage(named: "healthMeeting") ?? UIImage())
    static let e3 = Meeting(image: UIImage(named: "jazzMeeting") ?? UIImage())
    static let e4 = Meeting(image: UIImage(named: "3") ?? UIImage())
}
