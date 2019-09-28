//
//  MapViewController.swift
//  cfg
//
//  Created by Helal Chowdhury on 9/27/19.
//  Copyright © 2019 Helal. All rights reserved.
//

import UIKit
import MapKit
import CoreLocation
import FlyoverKit
import Speech

class MapViewController: UIViewController {
    @IBOutlet weak var mapView: MKMapView!
    
    
    let locationManager = CLLocationManager()
    var currentCoordinate: CLLocationCoordinate2D?
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        locationManager.delegate = self
        mapView.delegate = self
        userLocationSetup()
        self.mapSetup()
        
        
    }
    

    

}
