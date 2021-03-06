/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.dbtest.config.bean;

/**
 * Data set assert.
 * 
 * @author zhangliang 
 */
public interface DataSetAssert {
    
    /**
     * Get ID.
     * 
     * @return ID
     */
    String getId();
    
    /**
     * Get sharding rule types.
     * 
     * @return sharding rule types
     */
    String getShardingRuleTypes();
    
    /**
     * Set sharding rule types.
     * 
     * @param shardingRuleTypes sharding rule types
     */
    void setShardingRuleTypes(String shardingRuleTypes);
    
    /**
     * Get database types.
     * 
     * @return database types
     */
    String getDatabaseTypes();
    
    /**
     * Set database types.
     * 
     * @param databaseTypes database types
     */
    void setDatabaseTypes(String databaseTypes);
    
    /**
     * Get path.
     * 
     * @return path
     */
    String getPath();
    
    /**
     * Set path.
     * 
     * @param path path
     */
    void setPath(String path);
}
