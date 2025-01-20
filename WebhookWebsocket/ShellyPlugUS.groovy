#include ShellyUSA.ShellyUSA_Driver_Library

metadata {
  definition (name: 'Shelly Plug US (Websocket)', namespace: 'ShellyUSA', author: 'Daniel Winks', singleThreaded: false, importUrl: '') {
    capability 'Switch'
    capability 'Initialize'
    capability 'Configuration'
    capability 'Refresh'
    capability 'CurrentMeter' //amperage - NUMBER, unit:A
    capability 'PowerMeter' //power - NUMBER, unit:W
    capability 'VoltageMeasurement' //voltage - NUMBER, unit:V //frequency - NUMBER, unit:Hz
    capability 'EnergyMeter' //energy - NUMBER, unit:kWh
    command 'resetEnergyMonitors'
  }
}

@Field static Boolean WS = true
@Field static Boolean NOCHILDREN = true

// =============================================================================
// Device Specific
// =============================================================================
@CompileStatic
void on() { parentPostCommandAsync(switchSetCommand(true)) }

@CompileStatic
void off() { parentPostCommandAsync(switchSetCommand(false)) }

void refreshDeviceSpecificInfo() {}
// =============================================================================
// End Device Specific
// =============================================================================
