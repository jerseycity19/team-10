//
//  ProfileViewController.swift
//  cfg
//
//  Created by Helal Chowdhury on 9/28/19.
//  Copyright © 2019 Helal. All rights reserved.
//

import UIKit

class ProfileViewController: UIViewController {

    @IBOutlet weak var beginButton: UIButton!
    override func viewDidLoad() {
        super.viewDidLoad()
        beginButton.addTarget(self, action: "tapBegin", for: .touchUpInside)
        

    }
    @IBAction func tapBegin(_ sender: Any) {
//        UIApplication.shared.openURL(NSURL(string: "https://hangouts.google.com/call/coYtJmhhuN5CMkLkdxlIAEEE")! as URL)
        
        if let url = NSURL(string: "https://hangouts.google.com/call/coYtJmhhuN5CMkLkdxlIAEEE") {
            UIApplication.shared.openURL(url as URL)
        }
    }
    
   
    
}

