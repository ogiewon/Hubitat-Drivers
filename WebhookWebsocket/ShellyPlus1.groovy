#include ShellyUSA.ShellyUSA_Driver_Library

metadata {
  definition (name: 'Shelly Plus 1 & Plus 1 Mini', namespace: 'ShellyUSA', author: 'Daniel Winks', singleThreaded: false, importUrl: '') {
    capability 'Initialize'
    capability 'Configuration'
    capability 'Refresh'

    attribute 'lastUpdated', 'string'
  }
}
