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
    
    func userLocationSetup(){
        locationManager.requestAlwaysAuthorization() //we can ask this later
        locationManager.startUpdatingLocation()
        locationManager.distanceFilter = 100
        mapView.showsUserLocation = true
        mapView.mapType = MKMapType.hybrid
    }
    
    func zoomIn(_ coordinate: CLLocationCoordinate2D){
        let zoomRegion = MKCoordinateRegion(center: coordinate, latitudinalMeters: 10000, longitudinalMeters: 10000)
        mapView.setRegion(zoomRegion, animated: true)
    }
    
    func addAnnotations(){
        let timesSqaureAnnotation = MKPointAnnotation()
        timesSqaureAnnotation.title = "9/11 Day of Service"
        timesSqaureAnnotation.coordinate = CLLocationCoordinate2D(latitude: 40.6602, longitude: -73.9985)
        
        let empireStateAnnotation = MKPointAnnotation()
        empireStateAnnotation.title = "Hurricane Dorian Clothing Drive"
        empireStateAnnotation.coordinate = CLLocationCoordinate2D(latitude: 40.7484, longitude: -73.9857)
        
        let brooklynBridge = MKPointAnnotation()
        brooklynBridge.title = "Food Pantry Delivery"
        brooklynBridge.coordinate = CLLocationCoordinate2D(latitude: 40.7061, longitude: -73.9969)
        
        let prospectPark = MKPointAnnotation()
        prospectPark.title = "Feed The Homeless Soup Kitchen"
        prospectPark.coordinate = CLLocationCoordinate2D(latitude: 40.6602, longitude: -73.9690)
        
        let jersey = MKPointAnnotation()
        jersey.title = "It's My Park"
        jersey.coordinate = CLLocationCoordinate2D(latitude: 40.7178, longitude: -74.0431)
        
        mapView.addAnnotation(timesSqaureAnnotation)
        mapView.addAnnotation(empireStateAnnotation)
        mapView.addAnnotation(brooklynBridge)
        mapView.addAnnotation(prospectPark)
        mapView.addAnnotation(jersey)
    }

    

}
