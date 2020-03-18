/*
 * Licensed under the Apache License,Version2.0(the"License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,software
 * distributed under the License is distributed on an"AS IS"BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jenkins.gitpubsub;

import edu.umd.cs.findbugs.annotations.NonNull;
import jenkins.scm.api.SCMNavigator;
import jenkins.scm.api.SCMSourceObserver;
import jenkins.scm.api.trait.SCMNavigatorRequest;

/**
 * A {@link SCMNavigatorRequest} for {@link ASFGitSCMNavigatorContext}.
 */
public class ASFGitSCMNavigatorRequest extends SCMNavigatorRequest {
    /**
     * Constructor.
     *
     * @param source   the source.
     * @param context  the context.
     * @param observer the observer.
     */
    ASFGitSCMNavigatorRequest(@NonNull SCMNavigator source,
                              @NonNull
                                      ASFGitSCMNavigatorContext context,
                              @NonNull
                                      SCMSourceObserver observer) {
        super(source, context, observer);
    }
}
