//
//  LoginViewController.swift
//  cfg
//
//  Created by Helal Chowdhury on 9/27/19.
//  Copyright © 2019 Helal. All rights reserved.
//

import UIKit
//import Firebase
import GoogleSignIn

class LoginViewController: UIViewController {

    @IBOutlet weak var signInButton: GIDSignInButton!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        GIDSignIn.sharedInstance()?.presentingViewController = self
        
        
        // Automatically sign in the user.
        GIDSignIn.sharedInstance()?.restorePreviousSignIn()
        //        performSegue(withIdentifier: "MapViewController", sender: nil)
        // ...
    }
    

    func signIn(signIn: GIDSignIn!, didSignInForUser user: GIDGoogleUser!,
                withError error: NSError!) {
        if (error == nil) {
            // Perform any operations on signed in user here.
            // ...
            self.performSegue(withIdentifier: "MapViewController", sender: nil)
            
            
        } else {
            //            print("\(error.localizedDescription)")
            
        }
    }

}
