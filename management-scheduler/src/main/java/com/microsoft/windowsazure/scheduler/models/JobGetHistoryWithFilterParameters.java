/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.scheduler.models;

/**
* Parameters supplied to the Get Job History With Filter operation.
*/
public class JobGetHistoryWithFilterParameters extends JobGetHistoryParameters {
    private JobHistoryStatus status;
    
    /**
    * Required. Filter the job history to have it only return job execution
    * attempts having a particular Status, 'completed' or 'failed'.
    * @return The Status value.
    */
    public JobHistoryStatus getStatus() {
        return this.status;
    }
    
    /**
    * Required. Filter the job history to have it only return job execution
    * attempts having a particular Status, 'completed' or 'failed'.
    * @param statusValue The Status value.
    */
    public void setStatus(final JobHistoryStatus statusValue) {
        this.status = statusValue;
    }
    
    /**
    * Initializes a new instance of the JobGetHistoryWithFilterParameters class.
    *
    */
    public JobGetHistoryWithFilterParameters() {
        super();
    }
    
    /**
    * Initializes a new instance of the JobGetHistoryWithFilterParameters class
    * with required arguments.
    *
    */
    public JobGetHistoryWithFilterParameters(JobHistoryStatus status) {
        this.setStatus(status);
    }
}
