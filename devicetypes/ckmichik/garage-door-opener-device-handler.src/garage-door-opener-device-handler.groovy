/**
 *  Garage Door Opener Device Handler
 *
 *  Copyright 2019 Corey Kmichik
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 */
metadata {
	definition (name: "Garage Door Opener Device Handler", namespace: "ckmichik", author: "Corey Kmichik", cstHandler: true) {
		capability "Door Control"

		fingerprint mfr: "0000", prod: "0000", model: "0000", deviceJoinName: "Garage Door Opener"
	}


	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
		tiles (scale: 2) {
			// TODO: define your main and details tiles here
			standardTile("indicator", "device.indicatorStatus", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
				state "when off", action:"indicator.indicatorWhenOn", icon:"st.indicators.lit-when-off"
				state "when on", action:"indicator.indicatorNever", icon:"st.indicators.lit-when-on"
				state "never", action:"indicator.indicatorWhenOff", icon:"st.indicators.never-lit"
			}
			
			standardTile("refresh", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
				state "default", label:'', action:"refresh.refresh", icon:"st.secondary.refresh"
			}
		
		main(["switch"])
		details(["switch","refresh"])
		
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'door' attribute

}

// handle commands
def open() {
	log.debug "Executing 'open'"
	// TODO: handle 'open' command
}

def close() {
	log.debug "Executing 'close'"
	// TODO: handle 'close' command
}